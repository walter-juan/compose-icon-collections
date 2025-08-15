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

public val SolidGroup.Seedling: ImageVector
    get() {
        if (_seedling != null) {
            return _seedling!!
        }
        _seedling = Builder(name = "Seedling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 32.0f)
                curveTo(512.0f, 140.1f, 435.4f, 230.3f, 333.6f, 251.4f)
                curveTo(325.7f, 193.3f, 299.6f, 141.0f, 261.1f, 100.5f)
                curveTo(301.2f, 40.0f, 369.9f, 0.0f, 448.0f, 0.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 78.3f, 14.3f, 64.0f, 32.0f, 64.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(123.7f, 0.0f, 224.0f, 100.3f, 224.0f, 224.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -160.0f)
                curveTo(100.3f, 320.0f, 0.0f, 219.7f, 0.0f, 96.0f)
                close()
            }
        }
        .build()
        return _seedling!!
    }

private var _seedling: ImageVector? = null
