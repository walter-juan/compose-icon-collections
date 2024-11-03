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

public val Twbs.TypeH1: ImageVector
    get() {
        if (_typeH1 != null) {
            return _typeH1!!
        }
        _typeH1 = Builder(name = "TypeH1", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.648f, 13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.3f)
                verticalLineToRelative(4.234f)
                horizontalLineTo(1.348f)
                verticalLineTo(3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.348f)
                verticalLineTo(8.421f)
                horizontalLineTo(6.3f)
                verticalLineTo(13.0f)
                close()
                moveTo(14.0f, 13.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.333f)
                lineToRelative(-2.381f, 1.766f)
                verticalLineTo(6.12f)
                lineTo(12.6f, 4.443f)
                horizontalLineToRelative(0.066f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _typeH1!!
    }

private var _typeH1: ImageVector? = null
