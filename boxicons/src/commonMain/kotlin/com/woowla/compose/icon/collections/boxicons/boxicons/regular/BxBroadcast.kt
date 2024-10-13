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

public val RegularGroup.BxBroadcast: ImageVector
    get() {
        if (_bxBroadcast != null) {
            return _bxBroadcast!!
        }
        _bxBroadcast = Builder(name = "BxBroadcast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.707f, 4.293f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(2.733f, 2.733f, 2.733f, 7.353f, 0.0f, 10.086f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(3.5f, -3.5f, 3.5f, -9.414f, 0.0f, -12.914f)
                close()
                moveTo(15.293f, 8.707f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.292f, 0.879f, 2.043f)
                reflectiveCurveToRelative(-0.313f, 1.477f, -0.879f, 2.043f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.944f, -0.943f, 1.465f, -2.172f, 1.465f, -3.457f)
                reflectiveCurveToRelative(-0.521f, -2.514f, -1.465f, -3.457f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(6.207f, 5.707f)
                lineTo(4.793f, 4.293f)
                curveToRelative(-3.5f, 3.5f, -3.5f, 9.414f, 0.0f, 12.914f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(-2.733f, -2.733f, -2.733f, -7.353f, 0.0f, -10.086f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.293f, 7.293f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.172f, -1.465f, 3.457f)
                reflectiveCurveToRelative(0.521f, 2.514f, 1.465f, 3.457f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.292f, -0.879f, -2.043f)
                reflectiveCurveToRelative(0.313f, -1.477f, 0.879f, -2.043f)
                lineTo(7.293f, 7.293f)
                close()
                moveTo(14.0f, 10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, false, 0.895f, 1.666f)
                lineTo(10.002f, 22.0f)
                horizontalLineToRelative(3.996f)
                lineToRelative(-0.893f, -9.835f)
                curveToRelative(0.54f, -0.358f, 0.895f, -0.97f, 0.895f, -1.665f)
                close()
            }
        }
        .build()
        return _bxBroadcast!!
    }

private var _bxBroadcast: ImageVector? = null
