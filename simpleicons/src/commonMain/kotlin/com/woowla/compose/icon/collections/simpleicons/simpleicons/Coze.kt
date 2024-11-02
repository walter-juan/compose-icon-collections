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

public val Simpleicons.Coze: ImageVector
    get() {
        if (_coze != null) {
            return _coze!!
        }
        _coze = Builder(name = "Coze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.366f, 12.096f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.608f, 0.608f)
                verticalLineToRelative(1.218f)
                arcToRelative(0.609f, 0.609f, 0.0f, true, false, 1.217f, 0.0f)
                verticalLineToRelative(-1.218f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.609f, -0.608f)
                moveToRelative(0.8f, 3.453f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.0f, -0.86f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.859f, 0.0f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, false, 2.149f, 0.0f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.859f, 0.0f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.0f, 0.86f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, -3.867f, 0.0f)
                moveToRelative(4.062f, -2.24f)
                arcToRelative(0.61f, 0.61f, 0.0f, true, true, 0.609f, 0.609f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.61f, -0.609f)
                close()
                moveTo(3.023f, 0.0f)
                arcTo(3.024f, 3.024f, 0.0f, false, false, 0.0f, 3.023f)
                verticalLineToRelative(17.954f)
                arcTo(3.024f, 3.024f, 0.0f, false, false, 3.023f, 24.0f)
                horizontalLineToRelative(17.954f)
                arcTo(3.024f, 3.024f, 0.0f, false, false, 24.0f, 20.977f)
                verticalLineTo(3.023f)
                arcTo(3.024f, 3.024f, 0.0f, false, false, 20.977f, 0.0f)
                close()
                moveTo(12.1f, 3.78f)
                horizontalLineToRelative(0.004f)
                arcToRelative(6.287f, 6.287f, 0.0f, false, true, 6.283f, 6.286f)
                verticalLineToRelative(2.635f)
                horizontalLineToRelative(1.508f)
                curveToRelative(1.73f, 0.0f, 2.12f, 2.426f, 0.476f, 2.97f)
                lineToRelative(-1.984f, 0.663f)
                verticalLineToRelative(1.137f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, true, -2.19f, 1.353f)
                lineToRelative(-1.101f, -0.549f)
                curveToRelative(-0.052f, -0.024f, -0.115f, 0.0f, -0.131f, 0.055f)
                curveToRelative(-0.892f, 2.785f, -4.835f, 2.785f, -5.727f, 0.0f)
                arcToRelative(0.095f, 0.095f, 0.0f, false, false, -0.13f, -0.055f)
                lineToRelative(-1.102f, 0.55f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, true, -2.19f, -1.354f)
                verticalLineToRelative(-1.139f)
                lineToRelative(-1.984f, -0.66f)
                curveToRelative(-1.647f, -0.541f, -1.254f, -2.97f, 0.477f, -2.97f)
                horizontalLineToRelative(1.507f)
                verticalLineToRelative(-2.636f)
                arcTo(6.285f, 6.285f, 0.0f, false, true, 12.1f, 3.78f)
            }
        }
        .build()
        return _coze!!
    }

private var _coze: ImageVector? = null
