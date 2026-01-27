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

public val Octicons.Mcp16: ImageVector
    get() {
        if (_mcp16 != null) {
            return _mcp16!!
        }
        _mcp16 = Builder(name = "Mcp16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.52f, 1.12f)
                arcToRelative(3.578f, 3.578f, 0.0f, false, true, 6.078f, 2.98f)
                arcToRelative(3.578f, 3.578f, 0.0f, false, true, 2.982f, 6.08f)
                lineToRelative(-3.292f, 3.293f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, 0.0f, 0.354f)
                lineToRelative(0.843f, 0.843f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-0.844f, -0.843f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -2.474f)
                lineTo(13.52f, 9.12f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, false, 0.0f, -2.94f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, false, -2.94f, 0.0f)
                lineTo(7.731f, 9.03f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.67f, 7.97f)
                lineToRelative(2.85f, -2.85f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, false, 0.0f, -2.94f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, false, -2.94f, 0.0f)
                lineToRelative(-4.799f, 4.8f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.72f, 5.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.52f, 3.12f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(5.731f, 7.03f)
                arcTo(2.079f, 2.079f, 0.0f, false, false, 8.67f, 9.97f)
                lineToRelative(2.85f, -2.85f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-2.849f, 2.85f)
                arcTo(3.578f, 3.578f, 0.0f, false, true, 4.67f, 5.97f)
                close()
            }
        }
        .build()
        return _mcp16!!
    }

private var _mcp16: ImageVector? = null
