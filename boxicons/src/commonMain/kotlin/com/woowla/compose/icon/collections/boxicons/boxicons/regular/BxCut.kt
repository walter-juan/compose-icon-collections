package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCut: ImageVector
    get() {
        if (_bxCut != null) {
            return _bxCut!!
        }
        _bxCut = Builder(name = "BxCut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.5f)
                curveTo(10.0f, 4.57f, 8.43f, 3.0f, 6.5f, 3.0f)
                reflectiveCurveTo(3.0f, 4.57f, 3.0f, 6.5f)
                reflectiveCurveTo(4.57f, 10.0f, 6.5f, 10.0f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, 1.613f, -0.413f)
                lineToRelative(2.357f, 2.528f)
                lineToRelative(-2.318f, 2.318f)
                arcTo(3.46f, 3.46f, 0.0f, false, false, 6.5f, 14.0f)
                curveTo(4.57f, 14.0f, 3.0f, 15.57f, 3.0f, 17.5f)
                reflectiveCurveTo(4.57f, 21.0f, 6.5f, 21.0f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.601f, -0.166f, -1.158f, -0.434f, -1.652f)
                lineToRelative(2.269f, -2.268f)
                lineTo(17.0f, 19.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.121f, 0.879f)
                lineTo(22.0f, 20.0f)
                lineTo(9.35f, 8.518f)
                curveToRelative(0.406f, -0.572f, 0.65f, -1.265f, 0.65f, -2.018f)
                close()
                moveTo(6.5f, 8.0f)
                curveTo(5.673f, 8.0f, 5.0f, 7.327f, 5.0f, 6.5f)
                reflectiveCurveTo(5.673f, 5.0f, 6.5f, 5.0f)
                reflectiveCurveTo(8.0f, 5.673f, 8.0f, 6.5f)
                reflectiveCurveTo(7.327f, 8.0f, 6.5f, 8.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveTo(5.673f, 16.0f, 6.5f, 16.0f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveTo(7.327f, 19.0f, 6.5f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 4.879f)
                lineToRelative(-3.707f, 4.414f)
                lineToRelative(1.414f, 1.414f)
                lineTo(22.0f, 4.0f)
                horizontalLineToRelative(-2.879f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 4.879f)
                close()
            }
        }
        .build()
        return _bxCut!!
    }

private var _bxCut: ImageVector? = null
