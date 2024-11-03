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

public val Twbs.ExclamationTriangleFill: ImageVector
    get() {
        if (_exclamationTriangleFill != null) {
            return _exclamationTriangleFill!!
        }
        _exclamationTriangleFill = Builder(name = "ExclamationTriangleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.982f, 1.566f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, -1.96f, 0.0f)
                lineTo(0.165f, 13.233f)
                curveToRelative(-0.457f, 0.778f, 0.091f, 1.767f, 0.98f, 1.767f)
                horizontalLineToRelative(13.713f)
                curveToRelative(0.889f, 0.0f, 1.438f, -0.99f, 0.98f, -1.767f)
                close()
                moveTo(8.0f, 5.0f)
                curveToRelative(0.535f, 0.0f, 0.954f, 0.462f, 0.9f, 0.995f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -1.1f, 0.0f)
                lineTo(7.1f, 5.995f)
                arcTo(0.905f, 0.905f, 0.0f, false, true, 8.0f, 5.0f)
                moveToRelative(0.002f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
            }
        }
        .build()
        return _exclamationTriangleFill!!
    }

private var _exclamationTriangleFill: ImageVector? = null
