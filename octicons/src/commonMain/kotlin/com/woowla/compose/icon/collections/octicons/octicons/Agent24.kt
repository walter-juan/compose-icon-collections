package com.woowla.compose.icon.collections.octicons.octicons

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
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Agent24: ImageVector
    get() {
        if (_agent24 != null) {
            return _agent24!!
        }
        _agent24 = Builder(name = "Agent24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 13.919f)
                verticalLineToRelative(-0.278f)
                arcToRelative(5.097f, 5.097f, 0.0f, false, false, -4.961f, -5.086f)
                arcToRelative(0.858f, 0.858f, 0.0f, false, true, -0.754f, -0.497f)
                lineToRelative(-0.149f, -0.327f)
                arcTo(6.414f, 6.414f, 0.0f, false, false, 10.81f, 4.0f)
                arcToRelative(6.133f, 6.133f, 0.0f, false, false, -6.13f, 6.32f)
                lineToRelative(0.019f, 0.628f)
                arcToRelative(0.863f, 0.863f, 0.0f, false, true, -0.67f, 0.869f)
                arcTo(3.263f, 3.263f, 0.0f, false, false, 1.5f, 14.996f)
                verticalLineToRelative(0.108f)
                arcTo(3.397f, 3.397f, 0.0f, false, false, 4.896f, 18.5f)
                horizontalLineToRelative(1.577f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(4.896f)
                arcTo(4.896f, 4.896f, 0.0f, false, true, 0.0f, 15.104f)
                verticalLineToRelative(-0.108f)
                arcToRelative(4.761f, 4.761f, 0.0f, false, true, 3.185f, -4.493f)
                lineToRelative(-0.004f, -0.137f)
                arcTo(7.633f, 7.633f, 0.0f, false, true, 10.81f, 2.5f)
                arcToRelative(7.911f, 7.911f, 0.0f, false, true, 7.176f, 4.58f)
                curveTo(21.36f, 7.377f, 24.0f, 10.207f, 24.0f, 13.641f)
                verticalLineToRelative(0.278f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.306f, 11.77f)
                lineToRelative(3.374f, 3.375f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, 1.061f)
                lineToRelative(-3.375f, 3.375f)
                lineToRelative(-0.057f, 0.051f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.004f, -0.051f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.051f, -1.004f)
                lineToRelative(0.051f, -0.057f)
                lineToRelative(2.845f, -2.845f)
                lineToRelative(-2.844f, -2.844f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.061f, -1.061f)
                close()
                moveTo(22.5f, 19.8f)
                horizontalLineTo(18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
            }
        }
        .build()
        return _agent24!!
    }

private var _agent24: ImageVector? = null
