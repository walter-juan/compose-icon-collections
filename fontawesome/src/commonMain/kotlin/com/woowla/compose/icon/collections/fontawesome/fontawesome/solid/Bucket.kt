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

public val SolidGroup.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(443.7f, 208.0f)
                curveToRelative(2.7f, 4.7f, 4.3f, 10.2f, 4.3f, 16.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-5.1f, 0.0f)
                lineToRelative(-22.4f, 213.0f)
                curveToRelative(-2.6f, 24.4f, -23.2f, 43.0f, -47.8f, 43.0f)
                lineToRelative(-233.6f, 0.0f)
                curveToRelative(-24.6f, 0.0f, -45.2f, -18.5f, -47.8f, -43.0f)
                lineTo(37.1f, 256.0f)
                lineTo(32.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                curveToRelative(0.0f, -5.8f, 1.6f, -11.3f, 4.3f, -16.0f)
                lineToRelative(439.4f, 0.0f)
                close()
                moveTo(224.0f, -16.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveTo(80.0f, 48.5f, 144.5f, -16.0f, 224.0f, -16.0f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
