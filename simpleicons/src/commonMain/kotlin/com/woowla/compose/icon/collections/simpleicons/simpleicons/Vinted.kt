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

public val Simpleicons.Vinted: ImageVector
    get() {
        if (_vinted != null) {
            return _vinted!!
        }
        _vinted = Builder(name = "Vinted", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.316f, 0.0f)
                curveToRelative(-0.258f, 0.0f, -0.571f, 0.217f, -1.415f, 0.953f)
                curveToRelative(-0.3f, 0.108f, -0.627f, 0.027f, -1.008f, 0.613f)
                curveToRelative(-2.15f, 3.09f, -3.825f, 14.648f, -5.255f, 17.984f)
                curveToRelative(-0.286f, -1.444f, -0.885f, -10.837f, -1.116f, -13.41f)
                curveToRelative(-0.028f, -0.477f, 0.027f, -1.076f, 0.027f, -1.43f)
                curveToRelative(0.0f, -2.368f, -0.516f, -3.567f, -2.886f, -3.567f)
                curveToRelative(-1.198f, 0.0f, -2.382f, 0.436f, -3.008f, 1.226f)
                curveToRelative(-0.299f, 0.408f, -0.409f, 0.708f, -0.409f, 1.443f)
                curveToRelative(0.0f, 4.915f, 1.171f, 12.973f, 2.478f, 18.228f)
                curveTo(7.132f, 23.688f, 8.603f, 24.0f, 9.99f, 24.0f)
                curveToRelative(0.654f, 0.0f, 1.307f, -0.081f, 2.233f, -0.544f)
                curveToRelative(3.212f, -1.567f, 4.07f, -5.84f, 4.9f, -9.993f)
                curveToRelative(0.15f, -0.749f, 0.899f, -4.37f, 1.253f, -6.275f)
                curveToRelative(0.476f, -2.6f, 1.02f, -5.54f, 1.347f, -6.617f)
                curveTo(19.833f, 0.245f, 19.63f, 0.0f, 19.317f, 0.0f)
                close()
            }
        }
        .build()
        return _vinted!!
    }

private var _vinted: ImageVector? = null
