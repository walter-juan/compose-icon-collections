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

public val RegularGroup.BxGitCommit: ImageVector
    get() {
        if (_bxGitCommit != null) {
            return _bxGitCommit!!
        }
        _bxGitCommit = Builder(name = "BxGitCommit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-2.967f, 0.0f, -5.431f, 2.167f, -5.909f, 5.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.092f)
                curveToRelative(0.479f, 2.832f, 2.942f, 4.998f, 5.909f, 4.998f)
                reflectiveCurveToRelative(5.43f, -2.166f, 5.909f, -4.998f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-0.478f, -2.833f, -2.942f, -5.0f, -5.91f, -5.0f)
                close()
                moveTo(12.0f, 15.998f)
                curveToRelative(-2.205f, 0.0f, -3.999f, -1.794f, -3.999f, -3.999f)
                reflectiveCurveTo(9.795f, 8.0f, 12.0f, 8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 3.999f)
                reflectiveCurveToRelative(-1.794f, 3.999f, -4.0f, 3.999f)
                close()
            }
        }
        .build()
        return _bxGitCommit!!
    }

private var _bxGitCommit: ImageVector? = null
