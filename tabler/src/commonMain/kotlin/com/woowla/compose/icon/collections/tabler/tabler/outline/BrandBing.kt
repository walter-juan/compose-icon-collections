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

public val OutlineGroup.BrandBing: ImageVector
    get() {
        if (_brandBing != null) {
            return _brandBing!!
        }
        _brandBing = Builder(name = "BrandBing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                lineToRelative(4.0f, 1.5f)
                verticalLineToRelative(12.0f)
                lineToRelative(6.0f, -2.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -4.0f)
                lineToRelative(7.0f, 2.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-10.0f, 5.0f)
                lineToRelative(-4.0f, -2.0f)
                close()
            }
        }
        .build()
        return _brandBing!!
    }

private var _brandBing: ImageVector? = null
