package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.BrandDropbox: ImageVector
    get() {
        if (_brandDropbox != null) {
            return _brandDropbox!!
        }
        _brandDropbox = Builder(name = "BrandDropbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 10.625f)
                lineToRelative(-4.5f, -2.813f)
                lineToRelative(4.5f, -2.812f)
                lineToRelative(4.5f, 2.813f)
                moveToRelative(-4.5f, 2.812f)
                lineToRelative(4.5f, -2.813f)
                moveToRelative(-4.5f, 2.813f)
                lineToRelative(-4.5f, 2.823f)
                lineToRelative(4.5f, 2.802f)
                moveToRelative(0.0f, -5.625f)
                lineToRelative(4.5f, 2.823f)
                moveToRelative(0.0f, -5.636f)
                lineToRelative(4.5f, 2.791f)
                lineToRelative(4.5f, -2.812f)
                lineToRelative(-4.5f, -2.791f)
                lineToRelative(-4.5f, 2.813f)
                close()
                moveTo(7.5f, 16.25f)
                lineToRelative(4.5f, -2.802f)
                moveToRelative(-4.5f, 2.802f)
                verticalLineToRelative(1.123f)
                lineToRelative(4.5f, 2.627f)
                lineToRelative(4.5f, -2.627f)
                verticalLineToRelative(-1.123f)
                moveToRelative(-4.5f, -2.802f)
                lineToRelative(4.5f, -2.823f)
                lineToRelative(4.5f, 2.823f)
                lineToRelative(-4.5f, 2.802f)
                moveToRelative(-4.5f, -2.802f)
                lineToRelative(4.5f, 2.802f)
            }
        }
        .build()
        return _brandDropbox!!
    }

private var _brandDropbox: ImageVector? = null
