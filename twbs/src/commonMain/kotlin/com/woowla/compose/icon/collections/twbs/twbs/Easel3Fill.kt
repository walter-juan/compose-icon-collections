package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Easel3Fill: ImageVector
    get() {
        if (_easel3Fill != null) {
            return _easel3Fill!!
        }
        _easel3Fill = Builder(name = "Easel3Fill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 12.0f)
                verticalLineToRelative(1.134f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(7.5f, 12.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 10.5f)
                lineTo(1.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(0.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                close()
            }
        }
        .build()
        return _easel3Fill!!
    }

private var _easel3Fill: ImageVector? = null
