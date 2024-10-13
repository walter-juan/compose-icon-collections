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

public val RegularGroup.BxGitBranch: ImageVector
    get() {
        if (_bxGitBranch != null) {
            return _bxGitBranch!!
        }
        _bxGitBranch = Builder(name = "BxGitBranch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 4.0f)
                curveTo(15.57f, 4.0f, 14.0f, 5.57f, 14.0f, 7.5f)
                curveToRelative(0.0f, 1.554f, 1.025f, 2.859f, 2.43f, 3.315f)
                curveToRelative(-0.146f, 0.932f, -0.547f, 1.7f, -1.23f, 2.323f)
                curveToRelative(-1.946f, 1.773f, -5.527f, 1.935f, -7.2f, 1.907f)
                lineTo(8.0f, 8.837f)
                curveToRelative(1.44f, -0.434f, 2.5f, -1.757f, 2.5f, -3.337f)
                curveTo(10.5f, 3.57f, 8.93f, 2.0f, 7.0f, 2.0f)
                reflectiveCurveTo(3.5f, 3.57f, 3.5f, 5.5f)
                curveToRelative(0.0f, 1.58f, 1.06f, 2.903f, 2.5f, 3.337f)
                verticalLineToRelative(6.326f)
                curveToRelative(-1.44f, 0.434f, -2.5f, 1.757f, -2.5f, 3.337f)
                curveTo(3.5f, 20.43f, 5.07f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.551f, -0.14f, -1.065f, -0.367f, -1.529f)
                curveToRelative(2.06f, -0.186f, 4.657f, -0.757f, 6.409f, -2.35f)
                curveToRelative(1.097f, -0.997f, 1.731f, -2.264f, 1.904f, -3.768f)
                curveTo(19.915f, 10.438f, 21.0f, 9.1f, 21.0f, 7.5f)
                curveTo(21.0f, 5.57f, 19.43f, 4.0f, 17.5f, 4.0f)
                close()
                moveTo(5.5f, 5.5f)
                curveTo(5.5f, 4.673f, 6.173f, 4.0f, 7.0f, 4.0f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveTo(7.827f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(7.0f, 20.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.482f, -1.498f)
                lineToRelative(0.13f, 0.01f)
                arcTo(1.495f, 1.495f, 0.0f, false, true, 7.0f, 20.0f)
                close()
                moveTo(17.5f, 9.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveTo(16.673f, 6.0f, 17.5f, 6.0f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveTo(18.327f, 9.0f, 17.5f, 9.0f)
                close()
            }
        }
        .build()
        return _bxGitBranch!!
    }

private var _bxGitBranch: ImageVector? = null
