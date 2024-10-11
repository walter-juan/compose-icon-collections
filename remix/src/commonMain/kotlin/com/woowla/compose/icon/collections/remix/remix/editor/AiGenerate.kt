package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.AiGenerate: ImageVector
    get() {
        if (_aiGenerate != null) {
            return _aiGenerate!!
        }
        _aiGenerate = Builder(name = "AiGenerate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.25f)
                curveTo(16.795f, 5.25f, 18.25f, 3.795f, 18.25f, 2.0f)
                horizontalLineTo(19.75f)
                curveTo(19.75f, 3.795f, 21.205f, 5.25f, 23.0f, 5.25f)
                verticalLineTo(6.75f)
                curveTo(21.205f, 6.75f, 19.75f, 8.205f, 19.75f, 10.0f)
                horizontalLineTo(18.25f)
                curveTo(18.25f, 8.205f, 16.795f, 6.75f, 15.0f, 6.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(4.0f, 7.0f)
                curveTo(4.0f, 5.895f, 4.895f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                curveTo(3.791f, 3.0f, 2.0f, 4.791f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 19.209f, 3.791f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(20.209f, 21.0f, 22.0f, 19.209f, 22.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 18.105f, 19.105f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 19.0f, 4.0f, 18.105f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _aiGenerate!!
    }

private var _aiGenerate: ImageVector? = null
