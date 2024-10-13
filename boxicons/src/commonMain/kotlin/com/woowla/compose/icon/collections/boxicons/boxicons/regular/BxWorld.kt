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

public val RegularGroup.BxWorld: ImageVector
    get() {
        if (_bxWorld != null) {
            return _bxWorld!!
        }
        _bxWorld = Builder(name = "BxWorld", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -0.899f, 0.156f, -1.762f, 0.431f, -2.569f)
                lineTo(6.0f, 11.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(1.931f)
                curveTo(7.061f, 19.436f, 4.0f, 16.072f, 4.0f, 12.0f)
                close()
                moveTo(18.33f, 16.873f)
                curveTo(17.677f, 16.347f, 16.687f, 16.0f, 16.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(12.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-0.411f)
                curveTo(17.928f, 5.778f, 20.0f, 8.65f, 20.0f, 12.0f)
                arcToRelative(7.947f, 7.947f, 0.0f, false, true, -1.67f, 4.873f)
                close()
            }
        }
        .build()
        return _bxWorld!!
    }

private var _bxWorld: ImageVector? = null
