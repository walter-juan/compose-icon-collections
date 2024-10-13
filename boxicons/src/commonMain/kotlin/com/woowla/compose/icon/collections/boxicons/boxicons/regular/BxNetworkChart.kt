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

public val RegularGroup.BxNetworkChart: ImageVector
    get() {
        if (_bxNetworkChart != null) {
            return _bxNetworkChart!!
        }
        _bxNetworkChart = Builder(name = "BxNetworkChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.502f, 0.136f, 0.968f, 0.354f, 1.385f)
                lineToRelative(-1.116f, 1.302f)
                arcTo(3.976f, 3.976f, 0.0f, false, false, 13.0f, 8.0f)
                curveToRelative(-0.739f, 0.0f, -1.425f, 0.216f, -2.02f, 0.566f)
                lineTo(9.566f, 7.152f)
                arcTo(3.449f, 3.449f, 0.0f, false, false, 10.0f, 5.5f)
                curveTo(10.0f, 3.57f, 8.43f, 2.0f, 6.5f, 2.0f)
                reflectiveCurveTo(3.0f, 3.57f, 3.0f, 5.5f)
                reflectiveCurveTo(4.57f, 9.0f, 6.5f, 9.0f)
                curveToRelative(0.601f, 0.0f, 1.158f, -0.166f, 1.652f, -0.434f)
                lineTo(9.566f, 9.98f)
                arcTo(3.972f, 3.972f, 0.0f, false, false, 9.0f, 12.0f)
                curveToRelative(0.0f, 0.997f, 0.38f, 1.899f, 0.985f, 2.601f)
                lineToRelative(-1.692f, 1.692f)
                lineToRelative(0.025f, 0.025f)
                arcTo(2.962f, 2.962f, 0.0f, false, false, 7.0f, 16.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.476f, -0.121f, -0.919f, -0.318f, -1.318f)
                lineToRelative(0.025f, 0.025f)
                lineToRelative(1.954f, -1.954f)
                curveToRelative(0.421f, 0.15f, 0.867f, 0.247f, 1.339f, 0.247f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, false, -0.439f, -1.785f)
                lineToRelative(1.253f, -1.462f)
                curveToRelative(0.364f, 0.158f, 0.764f, 0.247f, 1.186f, 0.247f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(7.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(5.0f, 5.5f)
                curveTo(5.0f, 4.673f, 5.673f, 4.0f, 6.5f, 4.0f)
                reflectiveCurveTo(8.0f, 4.673f, 8.0f, 5.5f)
                reflectiveCurveTo(7.327f, 7.0f, 6.5f, 7.0f)
                reflectiveCurveTo(5.0f, 6.327f, 5.0f, 5.5f)
                close()
                moveTo(13.0f, 14.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(19.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxNetworkChart!!
    }

private var _bxNetworkChart: ImageVector? = null
