package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.Server: ImageVector
    get() {
        if (_server != null) {
            return _server!!
        }
        _server = Builder(name = "Server", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 112.0f)
                arcToRelative(176.0f, 80.0f, 0.0f, true, false, 352.0f, 0.0f)
                arcToRelative(176.0f, 80.0f, 0.0f, true, false, -352.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(432.0f, 112.0f)
                curveTo(432.0f, 112.0f, 432.0f, 376.05f, 432.0f, 400.0f)
                curveTo(432.0f, 444.18f, 353.2f, 480.0f, 256.0f, 480.0f)
                curveTo(158.8f, 480.0f, 80.0f, 444.18f, 80.0f, 400.0f)
                curveTo(80.0f, 378.17f, 80.0f, 112.0f, 80.0f, 112.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(432.0f, 256.0f)
                curveTo(432.0f, 300.18f, 353.2f, 336.0f, 256.0f, 336.0f)
                curveTo(158.8f, 336.0f, 80.0f, 300.18f, 80.0f, 256.0f)
            }
        }
        .build()
        return _server!!
    }

private var _server: ImageVector? = null
