package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsHappyBeaming: ImageVector
    get() {
        if (_bxsHappyBeaming != null) {
            return _bxsHappyBeaming!!
        }
        _bxsHappyBeaming = Builder(name = "BxsHappyBeaming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(2.201f, 0.0f, 3.0f, 1.794f, 3.0f, 3.0f)
                lineTo(9.0f, 12.0f)
                curveToRelative(-0.012f, -0.45f, -0.194f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-0.988f, 0.55f, -1.0f, 1.012f)
                lineTo(5.0f, 12.0f)
                curveToRelative(0.0f, -1.206f, 0.799f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, -4.0f, -5.0f, -4.0f)
                horizontalLineToRelative(10.0f)
                reflectiveCurveToRelative(-1.0f, 4.0f, -5.0f, 4.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(-0.012f, -0.45f, -0.194f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-0.988f, 0.55f, -1.0f, 1.012f)
                lineTo(13.0f, 12.0f)
                curveToRelative(0.0f, -1.206f, 0.799f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.794f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxsHappyBeaming!!
    }

private var _bxsHappyBeaming: ImageVector? = null
