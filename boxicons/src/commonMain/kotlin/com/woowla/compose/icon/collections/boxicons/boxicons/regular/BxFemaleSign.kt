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

public val RegularGroup.BxFemaleSign: ImageVector
    get() {
        if (_bxFemaleSign != null) {
            return _bxFemaleSign!!
        }
        _bxFemaleSign = Builder(name = "BxFemaleSign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.691f, 2.0f, 6.0f, 4.691f, 6.0f, 8.0f)
                curveToRelative(0.0f, 2.967f, 2.167f, 5.432f, 5.0f, 5.91f)
                lineTo(11.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.988f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.09f)
                curveToRelative(2.833f, -0.479f, 5.0f, -2.943f, 5.0f, -5.91f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxFemaleSign!!
    }

private var _bxFemaleSign: ImageVector? = null
