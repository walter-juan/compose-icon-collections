package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.MarkGithub24: ImageVector
    get() {
        if (_markGithub24 != null) {
            return _markGithub24!!
        }
        _markGithub24 = Builder(name = "MarkGithub24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(5.923f, 1.0f, 1.0f, 5.923f, 1.0f, 12.0f)
                curveToRelative(0.0f, 4.867f, 3.149f, 8.979f, 7.521f, 10.436f)
                curveToRelative(0.55f, 0.096f, 0.756f, -0.233f, 0.756f, -0.522f)
                curveToRelative(0.0f, -0.262f, -0.013f, -1.128f, -0.013f, -2.049f)
                curveToRelative(-2.764f, 0.509f, -3.479f, -0.674f, -3.699f, -1.292f)
                curveToRelative(-0.124f, -0.317f, -0.66f, -1.293f, -1.127f, -1.554f)
                curveToRelative(-0.385f, -0.207f, -0.936f, -0.715f, -0.014f, -0.729f)
                curveToRelative(0.866f, -0.014f, 1.485f, 0.797f, 1.691f, 1.128f)
                curveToRelative(0.99f, 1.663f, 2.571f, 1.196f, 3.204f, 0.907f)
                curveToRelative(0.096f, -0.715f, 0.385f, -1.196f, 0.701f, -1.471f)
                curveToRelative(-2.448f, -0.275f, -5.005f, -1.224f, -5.005f, -5.432f)
                curveToRelative(0.0f, -1.196f, 0.426f, -2.186f, 1.128f, -2.956f)
                curveToRelative(-0.111f, -0.275f, -0.496f, -1.402f, 0.11f, -2.915f)
                curveToRelative(0.0f, 0.0f, 0.921f, -0.288f, 3.024f, 1.128f)
                arcToRelative(10.193f, 10.193f, 0.0f, false, true, 2.75f, -0.371f)
                curveToRelative(0.936f, 0.0f, 1.871f, 0.123f, 2.75f, 0.371f)
                curveToRelative(2.104f, -1.43f, 3.025f, -1.128f, 3.025f, -1.128f)
                curveToRelative(0.605f, 1.513f, 0.221f, 2.64f, 0.111f, 2.915f)
                curveToRelative(0.701f, 0.77f, 1.127f, 1.747f, 1.127f, 2.956f)
                curveToRelative(0.0f, 4.222f, -2.571f, 5.157f, -5.019f, 5.432f)
                curveToRelative(0.399f, 0.344f, 0.743f, 1.004f, 0.743f, 2.035f)
                curveToRelative(0.0f, 1.471f, -0.014f, 2.654f, -0.014f, 3.025f)
                curveToRelative(0.0f, 0.289f, 0.206f, 0.632f, 0.756f, 0.522f)
                curveTo(19.851f, 20.979f, 23.0f, 16.854f, 23.0f, 12.0f)
                curveToRelative(0.0f, -6.077f, -4.922f, -11.0f, -11.0f, -11.0f)
                close()
            }
        }
        .build()
        return _markGithub24!!
    }

private var _markGithub24: ImageVector? = null
