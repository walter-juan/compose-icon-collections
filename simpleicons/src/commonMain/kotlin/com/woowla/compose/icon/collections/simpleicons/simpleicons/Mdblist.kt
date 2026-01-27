package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Mdblist: ImageVector
    get() {
        if (_mdblist != null) {
            return _mdblist!!
        }
        _mdblist = Builder(name = "Mdblist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.928f, 0.029f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 0.093f, 1.673f)
                curveToRelative(-0.085f, 0.248f, -0.09f, 0.629f, -0.09f, 10.33f)
                reflectiveCurveToRelative(0.005f, 10.08f, 0.09f, 10.33f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, 1.512f, 1.558f)
                lineToRelative(0.276f, 0.108f)
                horizontalLineToRelative(20.237f)
                lineToRelative(0.277f, -0.108f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, 1.512f, -1.559f)
                curveToRelative(0.085f, -0.25f, 0.09f, -0.63f, 0.09f, -10.33f)
                reflectiveCurveToRelative(-0.005f, -10.08f, -0.09f, -10.33f)
                arcTo(2.51f, 2.51f, 0.0f, false, false, 22.395f, 0.115f)
                lineToRelative(-0.277f, -0.109f)
                lineTo(12.117f, 0.0f)
                curveTo(6.615f, -0.004f, 2.032f, 0.011f, 1.929f, 0.029f)
                moveToRelative(7.48f, 8.067f)
                lineToRelative(2.123f, 2.004f)
                verticalLineToRelative(1.54f)
                curveToRelative(0.0f, 0.897f, -0.02f, 1.536f, -0.043f, 1.527f)
                reflectiveCurveToRelative(-0.92f, -0.845f, -1.995f, -1.86f)
                curveToRelative(-1.071f, -1.01f, -1.962f, -1.84f, -1.977f, -1.84f)
                reflectiveCurveToRelative(-0.024f, 1.91f, -0.024f, 4.248f)
                verticalLineToRelative(4.25f)
                lineTo(4.911f, 17.965f)
                lineTo(4.911f, 6.085f)
                horizontalLineToRelative(1.188f)
                lineToRelative(1.183f, 0.006f)
                close()
                moveTo(19.138f, 12.026f)
                verticalLineToRelative(5.94f)
                horizontalLineToRelative(-2.63f)
                lineToRelative(-0.01f, -4.25f)
                lineToRelative(-0.013f, -4.25f)
                lineToRelative(-1.907f, 1.795f)
                arcToRelative(367.0f, 367.0f, 0.0f, false, true, -1.98f, 1.864f)
                curveToRelative(-0.076f, 0.056f, -0.08f, -0.047f, -0.08f, -1.489f)
                verticalLineToRelative(-1.555f)
                lineToRelative(2.127f, -1.995f)
                lineToRelative(2.122f, -1.995f)
                lineToRelative(1.187f, -0.005f)
                horizontalLineToRelative(1.184f)
                close()
            }
        }
        .build()
        return _mdblist!!
    }

private var _mdblist: ImageVector? = null
