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

public val Octicons.HomeFill16: ImageVector
    get() {
        if (_homeFill16 != null) {
            return _homeFill16!!
        }
        _homeFill16 = Builder(name = "HomeFill16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.906f, 0.384f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.187f, 0.0f)
                lineToRelative(5.25f, 4.2f)
                curveToRelative(0.415f, 0.332f, 0.657f, 0.835f, 0.657f, 1.367f)
                verticalLineToRelative(7.019f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineTo(8.72f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 12.97f)
                verticalLineTo(5.95f)
                curveToRelative(0.0f, -0.531f, 0.242f, -1.034f, 0.657f, -1.366f)
                lineToRelative(5.249f, -4.2f)
                close()
            }
        }
        .build()
        return _homeFill16!!
    }

private var _homeFill16: ImageVector? = null
