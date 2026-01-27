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

public val Simpleicons.Vitest: ImageVector
    get() {
        if (_vitest != null) {
            return _vitest!!
        }
        _vitest = Builder(name = "Vitest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.545f, 23.3f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, true, -0.895f, 0.197f)
                lineTo(0.252f, 15.936f)
                arcTo(0.61f, 0.61f, 0.0f, false, true, 0.0f, 15.439f)
                verticalLineTo(6.325f)
                curveToRelative(0.0f, -0.502f, 0.569f, -0.792f, 0.975f, -0.497f)
                lineToRelative(6.358f, 4.624f)
                curveToRelative(0.594f, 0.433f, 1.432f, 0.25f, 1.793f, -0.39f)
                lineTo(14.393f, 0.7f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.535f, -0.314f)
                horizontalLineToRelative(8.455f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, true, 0.537f, 0.916f)
                close()
            }
        }
        .build()
        return _vitest!!
    }

private var _vitest: ImageVector? = null
