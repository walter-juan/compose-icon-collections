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

public val Octicons.AiModel24: ImageVector
    get() {
        if (_aiModel24 != null) {
            return _aiModel24!!
        }
        _aiModel24 = Builder(name = "AiModel24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.375f, 8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, -3.163f, 4.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(3.252f, 3.252f, 0.0f, false, true, -4.443f, 2.509f)
                lineTo(7.214f, 17.76f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, -1.342f, -0.674f)
                lineToRelative(1.672f, -2.957f)
                arcTo(3.238f, 3.238f, 0.0f, false, true, 6.75f, 12.0f)
                curveToRelative(0.0f, -0.907f, 0.371f, -1.727f, 0.97f, -2.316f)
                lineTo(6.117f, 6.846f)
                arcTo(3.253f, 3.253f, 0.0f, false, true, 1.875f, 3.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 5.526f, 2.32f)
                lineToRelative(1.603f, 2.836f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 13.093f, 11.0f)
                horizontalLineToRelative(3.119f)
                arcToRelative(3.252f, 3.252f, 0.0f, false, true, 3.163f, -2.5f)
                close()
                moveTo(10.0f, 10.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, 3.499f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 10.0f, 10.25f)
                close()
                moveTo(5.125f, 2.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                close()
                moveTo(17.625f, 11.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -3.5f, 0.0f)
                close()
                moveTo(3.375f, 20.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.501f, -0.001f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -3.501f, 0.001f)
                close()
            }
        }
        .build()
        return _aiModel24!!
    }

private var _aiModel24: ImageVector? = null
