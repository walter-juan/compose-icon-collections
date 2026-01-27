package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Node16: ImageVector
    get() {
        if (_node16 != null) {
            return _node16!!
        }
        _node16 = Builder(name = "Node16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, 1.061f, -0.439f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, 0.0f, -2.122f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, -2.122f, 0.0f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, false, 0.0f, 2.122f)
                curveTo(7.221f, 4.842f, 7.602f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, 1.061f, -0.439f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, 0.0f, -2.122f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, -2.122f, 0.0f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, false, 0.0f, 2.122f)
                curveToRelative(0.282f, 0.281f, 0.663f, 0.439f, 1.061f, 0.439f)
                close()
                moveTo(1.0f, 11.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.75f, -1.75f)
                lineTo(4.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 4.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.0f)
                lineToRelative(0.005f, 0.049f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, false, 0.245f, 0.201f)
                lineTo(4.5f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 13.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 11.5f)
                close()
                moveTo(13.5f, 11.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.201f, -0.245f)
                lineToRelative(-0.049f, -0.005f)
                lineTo(11.5f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 15.0f, 4.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.464f, -0.184f, 0.909f, -0.513f, 1.237f)
                arcToRelative(1.746f, 1.746f, 0.0f, false, true, -1.237f, 0.513f)
                lineTo(11.5f, 13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _node16!!
    }

private var _node16: ImageVector? = null
