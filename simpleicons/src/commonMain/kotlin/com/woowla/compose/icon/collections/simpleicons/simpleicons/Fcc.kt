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

public val Simpleicons.Fcc: ImageVector
    get() {
        if (_fcc != null) {
            return _fcc!!
        }
        _fcc = Builder(name = "Fcc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.412f, 17.587f)
                arcTo(7.89f, 7.89f, 0.0f, false, true, 10.268f, 6.414f)
                arcToRelative(7.867f, 7.867f, 0.0f, false, true, 11.144f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.839f, 0.996f)
                lineTo(24.0f, 6.116f)
                arcToRelative(10.03f, 10.03f, 0.0f, false, false, -8.16f, -4.196f)
                curveToRelative(-5.19f, 0.0f, -9.458f, 3.942f, -9.996f, 9.002f)
                horizontalLineToRelative(-3.82f)
                verticalLineTo(4.328f)
                horizontalLineTo(6.78f)
                lineTo(8.508f, 1.92f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(20.16f)
                lineToRelative(2.024f, -1.488f)
                verticalLineTo(13.08f)
                horizontalLineToRelative(3.82f)
                curveToRelative(0.538f, 5.059f, 4.806f, 9.0f, 9.996f, 9.0f)
                arcTo(10.03f, 10.03f, 0.0f, false, false, 24.0f, 17.884f)
                lineToRelative(-1.749f, -1.296f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.84f, 0.999f)
                moveToRelative(-5.57f, -9.205f)
                arcToRelative(3.61f, 3.61f, 0.0f, false, true, 2.97f, 1.572f)
                lineToRelative(1.752f, -1.296f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, false, -4.723f, -2.456f)
                curveToRelative(-3.194f, 0.0f, -5.782f, 2.595f, -5.782f, 5.798f)
                reflectiveCurveToRelative(2.588f, 5.796f, 5.782f, 5.797f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, false, 4.723f, -2.455f)
                lineToRelative(-1.751f, -1.296f)
                arcToRelative(3.61f, 3.61f, 0.0f, true, true, -2.972f, -5.664f)
            }
        }
        .build()
        return _fcc!!
    }

private var _fcc: ImageVector? = null
