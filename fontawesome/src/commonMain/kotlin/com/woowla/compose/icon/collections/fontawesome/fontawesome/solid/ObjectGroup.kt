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

public val SolidGroup.ObjectGroup: ImageVector
    get() {
        if (_objectGroup != null) {
            return _objectGroup!!
        }
        _objectGroup = Builder(name = "ObjectGroup", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 119.4f)
                curveTo(12.9f, 108.4f, 0.0f, 87.7f, 0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                curveToRelative(23.7f, 0.0f, 44.4f, 12.9f, 55.4f, 32.0f)
                lineToRelative(337.1f, 0.0f)
                curveTo(467.6f, 12.9f, 488.3f, 0.0f, 512.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 23.7f, -12.9f, 44.4f, -32.0f, 55.4f)
                lineToRelative(0.0f, 273.1f)
                curveToRelative(19.1f, 11.1f, 32.0f, 31.7f, 32.0f, 55.4f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-23.7f, 0.0f, -44.4f, -12.9f, -55.4f, -32.0f)
                lineToRelative(-337.1f, 0.0f)
                curveToRelative(-11.1f, 19.1f, -31.7f, 32.0f, -55.4f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -23.7f, 12.9f, -44.4f, 32.0f, -55.4f)
                lineToRelative(0.0f, -273.1f)
                close()
                moveTo(456.6f, 96.0f)
                lineTo(119.4f, 96.0f)
                curveToRelative(-5.6f, 9.7f, -13.7f, 17.8f, -23.4f, 23.4f)
                lineToRelative(0.0f, 273.1f)
                curveToRelative(9.7f, 5.6f, 17.8f, 13.7f, 23.4f, 23.4f)
                lineToRelative(337.1f, 0.0f)
                curveToRelative(5.6f, -9.7f, 13.7f, -17.8f, 23.4f, -23.4f)
                lineToRelative(0.0f, -273.1f)
                curveToRelative(-9.7f, -5.6f, -17.8f, -13.7f, -23.4f, -23.4f)
                close()
                moveTo(128.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                close()
                moveTo(256.0f, 320.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _objectGroup!!
    }

private var _objectGroup: ImageVector? = null
