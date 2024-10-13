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

public val RegularGroup.BxGitPullRequest: ImageVector
    get() {
        if (_bxGitPullRequest != null) {
            return _bxGitPullRequest!!
        }
        _bxGitPullRequest = Builder(name = "BxGitPullRequest", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(9.5f, 5.5f)
                curveTo(9.5f, 3.57f, 7.93f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveTo(2.5f, 3.57f, 2.5f, 5.5f)
                curveToRelative(0.0f, 1.58f, 1.06f, 2.903f, 2.5f, 3.337f)
                verticalLineToRelative(6.326f)
                curveToRelative(-1.44f, 0.434f, -2.5f, 1.757f, -2.5f, 3.337f)
                curveTo(2.5f, 20.43f, 4.07f, 22.0f, 6.0f, 22.0f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.58f, -1.06f, -2.903f, -2.5f, -3.337f)
                lineTo(7.0f, 8.837f)
                curveTo(8.44f, 8.403f, 9.5f, 7.08f, 9.5f, 5.5f)
                close()
                moveTo(4.5f, 5.5f)
                curveTo(4.5f, 4.673f, 5.173f, 4.0f, 6.0f, 4.0f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveTo(6.827f, 7.0f, 6.0f, 7.0f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(7.5f, 18.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveTo(5.173f, 17.0f, 6.0f, 17.0f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bxGitPullRequest!!
    }

private var _bxGitPullRequest: ImageVector? = null
