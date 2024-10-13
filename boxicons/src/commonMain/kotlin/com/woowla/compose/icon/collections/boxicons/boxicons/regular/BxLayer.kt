package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxLayer: ImageVector
    get() {
        if (_bxLayer != null) {
            return _bxLayer!!
        }
        _bxLayer = Builder(name = "BxLayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.999f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.516f, -0.874f)
                lineToRelative(-9.022f, -5.0f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, -0.968f, 0.0f)
                lineToRelative(-8.978f, 4.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.003f, 1.748f)
                lineToRelative(9.022f, 5.04f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 0.973f, 0.001f)
                lineToRelative(8.978f, -5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 7.999f)
                close()
                moveTo(12.023f, 11.854f)
                lineTo(5.06f, 7.965f)
                lineToRelative(6.917f, -3.822f)
                lineToRelative(6.964f, 3.859f)
                lineToRelative(-6.918f, 3.852f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.515f, 11.126f)
                lineTo(12.0f, 15.856f)
                lineToRelative(-8.515f, -4.73f)
                lineToRelative(-0.971f, 1.748f)
                lineToRelative(9.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.971f, 0.0f)
                lineToRelative(9.0f, -5.0f)
                lineToRelative(-0.97f, -1.748f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.515f, 15.126f)
                lineTo(12.0f, 19.856f)
                lineToRelative(-8.515f, -4.73f)
                lineToRelative(-0.971f, 1.748f)
                lineToRelative(9.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.971f, 0.0f)
                lineToRelative(9.0f, -5.0f)
                lineToRelative(-0.97f, -1.748f)
                close()
            }
        }
        .build()
        return _bxLayer!!
    }

private var _bxLayer: ImageVector? = null
