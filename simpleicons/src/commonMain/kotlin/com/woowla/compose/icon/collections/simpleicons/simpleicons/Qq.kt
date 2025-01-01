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

public val Simpleicons.Qq: ImageVector
    get() {
        if (_qq != null) {
            return _qq!!
        }
        _qq = Builder(name = "Qq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.395f, 15.035f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -0.803f, -2.264f)
                lineToRelative(-1.079f, -2.695f)
                curveToRelative(0.001f, -0.032f, 0.014f, -0.562f, 0.014f, -0.836f)
                curveTo(19.526f, 4.632f, 17.351f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.474f, 4.632f, 4.474f, 9.241f)
                curveToRelative(0.0f, 0.274f, 0.013f, 0.804f, 0.014f, 0.836f)
                lineToRelative(-1.08f, 2.695f)
                arcToRelative(39.0f, 39.0f, 0.0f, false, false, -0.802f, 2.264f)
                curveToRelative(-1.021f, 3.283f, -0.69f, 4.643f, -0.438f, 4.673f)
                curveToRelative(0.54f, 0.065f, 2.103f, -2.472f, 2.103f, -2.472f)
                curveToRelative(0.0f, 1.469f, 0.756f, 3.387f, 2.394f, 4.771f)
                curveToRelative(-0.612f, 0.188f, -1.363f, 0.479f, -1.845f, 0.835f)
                curveToRelative(-0.434f, 0.32f, -0.379f, 0.646f, -0.301f, 0.778f)
                curveToRelative(0.343f, 0.578f, 5.883f, 0.369f, 7.482f, 0.189f)
                curveToRelative(1.6f, 0.18f, 7.14f, 0.389f, 7.483f, -0.189f)
                curveToRelative(0.078f, -0.132f, 0.132f, -0.458f, -0.301f, -0.778f)
                curveToRelative(-0.483f, -0.356f, -1.233f, -0.646f, -1.846f, -0.836f)
                curveToRelative(1.637f, -1.384f, 2.393f, -3.302f, 2.393f, -4.771f)
                curveToRelative(0.0f, 0.0f, 1.563f, 2.537f, 2.103f, 2.472f)
                curveToRelative(0.251f, -0.03f, 0.581f, -1.39f, -0.438f, -4.673f)
            }
        }
        .build()
        return _qq!!
    }

private var _qq: ImageVector? = null
