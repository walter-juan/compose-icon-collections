package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.416f, 0.223f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.832f, 0.0f)
                lineToRelative(-3.0f, 4.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 5.0f, 5.5f)
                horizontalLineToRelative(0.098f)
                lineTo(3.076f, 8.735f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.5f, 9.5f)
                horizontalLineToRelative(0.191f)
                lineToRelative(-1.638f, 3.276f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.447f, 0.724f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.447f, -0.724f)
                lineTo(12.31f, 9.5f)
                horizontalLineToRelative(0.191f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.424f, -0.765f)
                lineTo(10.902f, 5.5f)
                horizontalLineTo(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.416f, -0.777f)
                close()
                moveTo(6.437f, 4.758f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 6.0f, 4.5f)
                horizontalLineToRelative(-0.066f)
                lineTo(8.0f, 1.401f)
                lineTo(10.066f, 4.5f)
                horizontalLineTo(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.424f, 0.765f)
                lineTo(11.598f, 8.5f)
                horizontalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.447f, 0.724f)
                lineTo(12.69f, 12.5f)
                horizontalLineTo(3.309f)
                lineToRelative(1.638f, -3.276f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 4.5f, 8.5f)
                horizontalLineToRelative(-0.098f)
                lineToRelative(2.022f, -3.235f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.013f, -0.507f)
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
