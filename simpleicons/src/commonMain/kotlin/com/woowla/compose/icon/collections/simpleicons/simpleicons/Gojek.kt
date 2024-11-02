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

public val Simpleicons.Gojek: ImageVector
    get() {
        if (_gojek != null) {
            return _gojek!!
        }
        _gojek = Builder(name = "Gojek", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.072f, 0.713f)
                arcToRelative(15.38f, 15.38f, 0.0f, false, false, -0.643f, 0.011f)
                curveTo(5.317f, 0.998f, 0.344f, 5.835f, 0.017f, 11.818f)
                curveToRelative(-0.266f, 4.913f, 2.548f, 9.21f, 6.723f, 11.204f)
                curveToRelative(1.557f, 0.744f, 3.405f, -0.19f, 3.706f, -1.861f)
                curveToRelative(0.203f, -1.126f, -0.382f, -2.241f, -1.429f, -2.742f)
                curveToRelative(-2.373f, -1.139f, -3.966f, -3.602f, -3.778f, -6.406f)
                curveToRelative(0.22f, -3.28f, 2.931f, -5.945f, 6.279f, -6.171f)
                curveToRelative(3.959f, -0.267f, 7.257f, 2.797f, 7.257f, 6.619f)
                curveToRelative(0.0f, 2.623f, -1.553f, 4.888f, -3.809f, 5.965f)
                arcToRelative(2.511f, 2.511f, 0.0f, false, false, -1.395f, 2.706f)
                lineToRelative(0.011f, 0.056f)
                curveToRelative(0.295f, 1.644f, 2.111f, 2.578f, 3.643f, 1.852f)
                curveTo(21.233f, 21.139f, 24.0f, 17.117f, 24.0f, 12.461f)
                curveTo(23.996f, 5.995f, 18.664f, 0.749f, 12.072f, 0.711f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(12.011f, 8.327f)
                curveToRelative(-2.331f, 0.0f, -4.225f, 1.856f, -4.225f, 4.139f)
                curveToRelative(0.0f, 2.282f, 1.894f, 4.137f, 4.225f, 4.137f)
                curveToRelative(2.33f, 0.0f, 4.225f, -1.855f, 4.225f, -4.137f)
                curveToRelative(0.0f, -2.283f, -1.895f, -4.139f, -4.225f, -4.139f)
                close()
            }
        }
        .build()
        return _gojek!!
    }

private var _gojek: ImageVector? = null
