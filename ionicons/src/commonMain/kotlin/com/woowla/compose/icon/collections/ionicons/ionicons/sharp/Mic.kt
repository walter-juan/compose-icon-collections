package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Square, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 448.0f)
                lineTo(320.0f, 448.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Square, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 208.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 70.4f, -57.6f, 128.0f, -128.0f, 128.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-70.4f, 0.0f, -128.0f, -57.6f, -128.0f, -128.0f)
                verticalLineTo(208.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Square, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 368.0f)
                lineTo(256.0f, 448.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 320.0f)
                arcToRelative(78.83f, 78.83f, 0.0f, false, true, -56.55f, -24.1f)
                arcTo(80.89f, 80.89f, 0.0f, false, true, 176.0f, 239.0f)
                verticalLineTo(128.0f)
                arcToRelative(79.69f, 79.69f, 0.0f, false, true, 80.0f, -80.0f)
                curveToRelative(44.86f, 0.0f, 80.0f, 35.14f, 80.0f, 80.0f)
                verticalLineTo(239.0f)
                curveTo(336.0f, 283.66f, 300.11f, 320.0f, 256.0f, 320.0f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
