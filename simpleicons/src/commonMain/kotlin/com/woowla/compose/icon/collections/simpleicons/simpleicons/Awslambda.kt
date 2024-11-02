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

public val Simpleicons.Awslambda: ImageVector
    get() {
        if (_awslambda != null) {
            return _awslambda!!
        }
        _awslambda = Builder(name = "Awslambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.985f, 0.0f)
                curveToRelative(-0.294f, 0.003f, -0.534f, 0.247f, -0.534f, 0.548f)
                lineTo(4.446f, 5.456f)
                curveToRelative(0.0f, 0.145f, 0.06f, 0.283f, 0.159f, 0.389f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, false, 0.381f, 0.156f)
                horizontalLineToRelative(3.428f)
                lineToRelative(8.197f, 17.681f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, false, 0.488f, 0.318f)
                horizontalLineToRelative(5.811f)
                curveToRelative(0.297f, 0.0f, 0.543f, -0.245f, 0.543f, -0.548f)
                lineTo(23.453f, 18.544f)
                curveToRelative(0.0f, -0.303f, -0.239f, -0.548f, -0.543f, -0.548f)
                horizontalLineToRelative(-2.014f)
                lineTo(12.739f, 0.315f)
                curveTo(12.647f, 0.124f, 12.456f, 0.0f, 12.245f, 0.0f)
                horizontalLineToRelative(-7.254f)
                close()
                moveTo(5.525f, 1.091f)
                horizontalLineToRelative(6.368f)
                lineToRelative(8.16f, 17.68f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, false, 0.488f, 0.318f)
                horizontalLineToRelative(1.818f)
                verticalLineToRelative(3.817f)
                lineTo(17.437f, 22.907f)
                lineTo(9.24f, 5.226f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, false, -0.488f, -0.318f)
                lineTo(5.522f, 4.908f)
                close()
                moveTo(7.539f, 9.327f)
                curveToRelative(-0.21f, 0.001f, -0.394f, 0.119f, -0.486f, 0.31f)
                lineTo(0.6f, 23.213f)
                arcToRelative(0.551f, 0.551f, 0.0f, false, false, 0.031f, 0.528f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, false, 0.454f, 0.25f)
                horizontalLineToRelative(6.169f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, 0.497f, -0.31f)
                lineToRelative(3.38f, -7.166f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.003f, -0.469f)
                lineTo(8.036f, 9.637f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, -0.494f, -0.31f)
                close()
                moveTo(7.545f, 11.131f)
                lineTo(10.033f, 16.283f)
                lineTo(6.911f, 22.904f)
                lineTo(1.946f, 22.904f)
                close()
            }
        }
        .build()
        return _awslambda!!
    }

private var _awslambda: ImageVector? = null
