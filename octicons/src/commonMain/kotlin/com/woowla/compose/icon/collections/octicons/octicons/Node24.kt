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

public val Octicons.Node24: ImageVector
    get() {
        if (_node24 != null) {
            return _node24!!
        }
        _node24 = Builder(name = "Node24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.001f, -4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.001f, -4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 21.0f)
                close()
                moveTo(2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.75f, -1.75f)
                lineTo(7.5f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 5.75f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 3.5f, 6.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(0.005f, 0.049f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, false, 0.245f, 0.201f)
                lineTo(7.5f, 18.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 19.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 18.0f)
                close()
                moveTo(20.5f, 18.0f)
                lineTo(20.5f, 6.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(16.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.464f, -0.184f, 0.909f, -0.513f, 1.237f)
                arcToRelative(1.746f, 1.746f, 0.0f, false, true, -1.237f, 0.513f)
                lineTo(16.5f, 19.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _node24!!
    }

private var _node24: ImageVector? = null
