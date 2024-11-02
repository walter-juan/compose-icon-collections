package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.NavigateCircle: ImageVector
    get() {
        if (_navigateCircle != null) {
            return _navigateCircle!!
        }
        _navigateCircle = Builder(name = "NavigateCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcTo(208.23f, 208.23f, 0.0f, false, false, 48.0f, 256.0f)
                curveToRelative(0.0f, 114.68f, 93.31f, 208.0f, 208.0f, 208.0f)
                horizontalLineToRelative(0.0f)
                arcTo(208.23f, 208.23f, 0.0f, false, false, 464.0f, 256.0f)
                curveTo(464.0f, 141.31f, 370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(248.0f, 409.0f)
                lineTo(248.0f, 264.0f)
                lineTo(104.0f, 264.0f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(259.0f, -114.11f)
                close()
            }
        }
        .build()
        return _navigateCircle!!
    }

private var _navigateCircle: ImageVector? = null
