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

public val Simpleicons.Fontawesome: ImageVector
    get() {
        if (_fontawesome != null) {
            return _fontawesome!!
        }
        _fontawesome = Builder(name = "Fontawesome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.393f, 4.5f)
                curveToRelative(0.684f, -0.432f, 1.138f, -1.194f, 1.138f, -2.063f)
                curveTo(5.531f, 1.091f, 4.44f, 0.0f, 3.094f, 0.0f)
                curveTo(1.747f, 0.0f, 0.656f, 1.091f, 0.656f, 2.438f)
                curveToRelative(0.0f, 0.78f, 0.367f, 1.475f, 0.938f, 1.921f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(17.513f)
                curveToRelative(0.683f, 0.0f, 1.237f, -0.554f, 1.237f, -1.237f)
                arcToRelative(1.237f, 1.237f, 0.0f, false, false, -0.107f, -0.503f)
                lineToRelative(-2.893f, -6.51f)
                lineToRelative(2.893f, -6.51f)
                arcToRelative(1.237f, 1.237f, 0.0f, false, false, 0.107f, -0.503f)
                curveToRelative(0.0f, -0.683f, -0.554f, -1.237f, -1.237f, -1.237f)
                close()
            }
        }
        .build()
        return _fontawesome!!
    }

private var _fontawesome: ImageVector? = null
