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

public val Twbs.RCircleFill: ImageVector
    get() {
        if (_rCircleFill != null) {
            return _rCircleFill!!
        }
        _rCircleFill = Builder(name = "RCircleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(5.5f, 4.002f)
                lineTo(5.5f, 12.0f)
                horizontalLineToRelative(1.335f)
                lineTo(6.835f, 8.924f)
                lineTo(8.52f, 8.924f)
                lineTo(9.98f, 12.0f)
                horizontalLineToRelative(1.52f)
                lineTo(9.856f, 8.701f)
                curveToRelative(0.828f, -0.299f, 1.495f, -1.101f, 1.495f, -2.238f)
                curveToRelative(0.0f, -1.488f, -1.03f, -2.461f, -2.74f, -2.461f)
                close()
                moveTo(6.835f, 5.092f)
                verticalLineToRelative(2.777f)
                horizontalLineToRelative(1.549f)
                curveToRelative(0.995f, 0.0f, 1.573f, -0.463f, 1.573f, -1.36f)
                curveToRelative(0.0f, -0.913f, -0.596f, -1.417f, -1.537f, -1.417f)
                close()
            }
        }
        .build()
        return _rCircleFill!!
    }

private var _rCircleFill: ImageVector? = null
