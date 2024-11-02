package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Dictionarydotcom: ImageVector
    get() {
        if (_dictionarydotcom != null) {
            return _dictionarydotcom!!
        }
        _dictionarydotcom = Builder(name = "Dictionarydotcom", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.894f, 0.087f)
                lineTo(1.043f, 0.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.305f, 0.293f)
                verticalLineTo(18.97f)
                arcToRelative(0.331f, 0.331f, 0.0f, false, false, 0.166f, 0.28f)
                lineToRelative(8.13f, 4.713f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, false, 0.364f, -0.092f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.038f, -0.138f)
                verticalLineTo(6.275f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.176f, -0.292f)
                lineTo(4.944f, 3.625f)
                arcToRelative(0.173f, 0.173f, 0.0f, false, true, -0.084f, -0.21f)
                arcToRelative(0.173f, 0.173f, 0.0f, false, true, 0.197f, -0.112f)
                lineToRelative(7.804f, 1.333f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.252f, 0.302f)
                verticalLineToRelative(15.717f)
                arcToRelative(0.307f, 0.307f, 0.0f, false, false, 0.309f, 0.308f)
                horizontalLineToRelative(0.035f)
                curveToRelative(5.781f, -0.645f, 9.72f, -4.693f, 9.804f, -10.308f)
                curveToRelative(0.078f, -6.28f, -4.595f, -10.48f, -11.367f, -10.568f)
                close()
            }
        }
        .build()
        return _dictionarydotcom!!
    }

private var _dictionarydotcom: ImageVector? = null
