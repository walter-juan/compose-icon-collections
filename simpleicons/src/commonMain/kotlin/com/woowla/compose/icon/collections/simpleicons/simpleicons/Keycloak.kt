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

public val Simpleicons.Keycloak: ImageVector
    get() {
        if (_keycloak != null) {
            return _keycloak!!
        }
        _keycloak = Builder(name = "Keycloak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.742f, 1.182f)
                lineToRelative(-12.493f, 0.002f)
                curveTo(4.155f, 4.784f, 2.079f, 8.393f, 0.0f, 12.002f)
                curveToRelative(2.071f, 3.612f, 4.162f, 7.214f, 6.252f, 10.816f)
                lineToRelative(12.49f, -0.004f)
                lineToRelative(3.089f, -5.404f)
                horizontalLineToRelative(2.158f)
                verticalLineToRelative(-0.002f)
                lineTo(24.0f, 17.408f)
                lineTo(23.996f, 6.59f)
                horizontalLineToRelative(-2.168f)
                close()
                moveTo(8.327f, 4.792f)
                horizontalLineToRelative(2.081f)
                lineToRelative(1.04f, 1.8f)
                lineToRelative(-3.12f, 5.413f)
                lineToRelative(3.117f, 5.403f)
                lineToRelative(-1.035f, 1.81f)
                lineTo(8.327f, 19.218f)
                arcToRelative(2047.566f, 2047.566f, 0.0f, false, false, -4.168f, -7.204f)
                curveTo(5.547f, 9.606f, 6.937f, 7.2f, 8.327f, 4.792f)
                close()
                moveTo(14.568f, 4.792f)
                lineTo(16.654f, 4.795f)
                curveToRelative(1.393f, 2.405f, 2.78f, 4.813f, 4.166f, 7.222f)
                lineToRelative(-4.167f, 7.2f)
                horizontalLineToRelative(-2.08f)
                curveToRelative(-0.382f, -0.562f, -1.038f, -1.808f, -1.038f, -1.808f)
                lineToRelative(3.123f, -5.405f)
                lineToRelative(-3.124f, -5.413f)
                close()
            }
        }
        .build()
        return _keycloak!!
    }

private var _keycloak: ImageVector? = null
