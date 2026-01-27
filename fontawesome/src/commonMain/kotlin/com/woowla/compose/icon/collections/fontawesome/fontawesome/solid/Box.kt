package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.4f, 128.0f)
                lineToRelative(-34.3f, -48.0f)
                lineToRelative(-222.1f, 0.0f)
                lineToRelative(-34.3f, 48.0f)
                lineToRelative(290.7f, 0.0f)
                close()
                moveTo(0.0f, 148.5f)
                curveToRelative(0.0f, -13.3f, 4.2f, -26.3f, 11.9f, -37.2f)
                lineTo(60.9f, 42.8f)
                curveTo(72.9f, 26.0f, 92.3f, 16.0f, 112.9f, 16.0f)
                lineToRelative(222.1f, 0.0f)
                curveToRelative(20.7f, 0.0f, 40.1f, 10.0f, 52.1f, 26.8f)
                lineToRelative(48.9f, 68.5f)
                curveToRelative(7.8f, 10.9f, 11.9f, 23.9f, 11.9f, 37.2f)
                lineTo(448.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 148.5f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
