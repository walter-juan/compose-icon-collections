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

public val RegularGroup.BxBomb: ImageVector
    get() {
        if (_bxBomb != null) {
            return _bxBomb!!
        }
        _bxBomb = Builder(name = "BxBomb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.001f)
                curveToRelative(-1.4f, 0.0f, -2.584f, 1.167f, -2.707f, 1.293f)
                lineTo(17.207f, 5.38f)
                lineToRelative(-1.091f, -1.088f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.413f, 0.001f)
                lineTo(13.46f, 5.537f)
                arcTo(8.353f, 8.353f, 0.0f, false, false, 10.5f, 5.0f)
                curveTo(5.813f, 5.0f, 2.0f, 8.813f, 2.0f, 13.5f)
                reflectiveCurveTo(5.813f, 22.0f, 10.5f, 22.0f)
                reflectiveCurveToRelative(8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -0.909f, -0.144f, -1.8f, -0.428f, -2.658f)
                lineToRelative(1.345f, -1.345f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -0.001f, -1.415f)
                lineToRelative(-1.293f, -1.29f)
                lineToRelative(1.088f, -1.088f)
                curveToRelative(0.229f, -0.229f, 0.845f, -0.703f, 1.289f, -0.703f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(16.489f, 10.979f)
                curveToRelative(0.339f, 0.804f, 0.511f, 1.652f, 0.511f, 2.521f)
                curveToRelative(0.0f, 3.584f, -2.916f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveTo(4.0f, 17.084f, 4.0f, 13.5f)
                reflectiveCurveTo(6.916f, 7.0f, 10.5f, 7.0f)
                curveToRelative(0.96f, 0.0f, 1.89f, 0.21f, 2.762f, 0.624f)
                curveToRelative(0.381f, 0.181f, 0.837f, 0.103f, 1.136f, -0.196f)
                lineToRelative(1.014f, -1.014f)
                lineToRelative(2.384f, 2.377f)
                lineToRelative(-1.092f, 1.092f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.215f, 1.096f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 13.5f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, false, 1.318f, 3.182f)
                lineToRelative(1.414f, -1.414f)
                curveTo(8.26f, 14.795f, 8.0f, 14.168f, 8.0f, 13.5f)
                reflectiveCurveToRelative(0.26f, -1.295f, 0.732f, -1.768f)
                arcTo(2.484f, 2.484f, 0.0f, false, true, 10.5f, 11.0f)
                verticalLineTo(9.0f)
                arcToRelative(4.469f, 4.469f, 0.0f, false, false, -3.182f, 1.318f)
                arcTo(4.47f, 4.47f, 0.0f, false, false, 6.0f, 13.5f)
                close()
            }
        }
        .build()
        return _bxBomb!!
    }

private var _bxBomb: ImageVector? = null
