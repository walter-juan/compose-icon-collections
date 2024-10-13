package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxGitCompare: ImageVector
    get() {
        if (_bxGitCompare != null) {
            return _bxGitCompare!!
        }
        _bxGitCompare = Builder(name = "BxGitCompare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.01f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.58f, 1.06f, 2.903f, 2.5f, 3.337f)
                verticalLineToRelative(7.16f)
                curveToRelative(-0.001f, 0.179f, 0.027f, 1.781f, 1.174f, 2.931f)
                curveTo(6.892f, 19.64f, 7.84f, 20.0f, 9.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(4.0f, -3.0f)
                lineToRelative(-4.0f, -3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.823f, 0.0f, -1.984f, -1.534f, -1.99f, -2.0f)
                lineTo(7.01f, 8.837f)
                curveToRelative(1.44f, -0.434f, 2.5f, -1.757f, 2.5f, -3.337f)
                curveToRelative(0.0f, -1.93f, -1.571f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(6.01f, 7.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveTo(5.183f, 4.0f, 6.01f, 4.0f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveTo(6.837f, 7.0f, 6.01f, 7.0f)
                close()
                moveTo(19.01f, 15.163f)
                lineTo(19.01f, 7.997f)
                curveTo(19.005f, 6.391f, 17.933f, 4.0f, 15.0f, 4.0f)
                lineTo(15.0f, 2.0f)
                lineToRelative(-4.0f, 3.0f)
                lineToRelative(4.0f, 3.0f)
                lineTo(15.0f, 6.0f)
                curveToRelative(1.829f, 0.0f, 2.001f, 1.539f, 2.01f, 2.0f)
                verticalLineToRelative(7.163f)
                curveToRelative(-1.44f, 0.434f, -2.5f, 1.757f, -2.5f, 3.337f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.58f, -1.06f, -2.903f, -2.5f, -3.337f)
                close()
                moveTo(18.01f, 20.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bxGitCompare!!
    }

private var _bxGitCompare: ImageVector? = null
