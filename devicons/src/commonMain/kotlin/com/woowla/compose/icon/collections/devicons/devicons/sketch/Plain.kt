package com.woowla.compose.icon.collections.devicons.devicons.sketch

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SketchGroup

public val SketchGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFfdad00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.42f, 6.62f)
                lineTo(27.98f, 10.07f)
                lineToRelative(-1.86f, 34.51f)
                close()
                moveTo(66.79f, 6.62f)
                lineTo(102.17f, 44.68f)
                lineTo(100.3f, 10.13f)
                close()
                moveTo(64.1f, 6.78f)
                lineTo(27.16f, 46.47f)
                horizontalLineToRelative(73.83f)
                lineToRelative(-0.41f, -0.45f)
                close()
                moveTo(25.63f, 12.49f)
                lineTo(0.0f, 46.47f)
                horizontalLineToRelative(23.81f)
                close()
                moveTo(102.52f, 12.49f)
                lineTo(104.34f, 46.43f)
                lineTo(128.0f, 46.43f)
                close()
                moveTo(0.33f, 48.54f)
                lineToRelative(58.87f, 68.0f)
                lineToRelative(-35.01f, -68.0f)
                close()
                moveTo(26.5f, 48.54f)
                lineTo(64.14f, 121.38f)
                lineTo(101.65f, 48.54f)
                close()
                moveTo(103.97f, 48.54f)
                lineTo(68.96f, 116.54f)
                lineTo(127.82f, 48.54f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
