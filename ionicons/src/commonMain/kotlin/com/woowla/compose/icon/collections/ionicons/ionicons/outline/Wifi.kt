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

public val OutlineGroup.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(318.59f, 363.5f)
                lineTo(256.0f, 424.0f)
                lineTo(193.41f, 363.5f)
                curveTo(193.41f, 363.5f, 212.0f, 336.0f, 256.0f, 336.0f)
                curveTo(300.0f, 336.0f, 318.59f, 363.5f, 318.59f, 363.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(407.31f, 278.0f)
                lineTo(372.0f, 312.0f)
                curveTo(372.0f, 312.0f, 331.0f, 266.0f, 256.0f, 266.0f)
                curveTo(181.0f, 266.0f, 140.0f, 312.0f, 140.0f, 312.0f)
                lineTo(104.69f, 278.0f)
                curveTo(104.69f, 278.0f, 142.5f, 214.0f, 256.0f, 214.0f)
                curveTo(369.5f, 214.0f, 407.31f, 278.0f, 407.31f, 278.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(496.0f, 192.0f)
                lineTo(459.31f, 227.5f)
                curveTo(459.31f, 227.5f, 386.5f, 141.0f, 256.0f, 141.0f)
                curveTo(125.5f, 141.0f, 52.69f, 227.5f, 52.69f, 227.5f)
                lineTo(16.0f, 192.0f)
                curveTo(16.0f, 192.0f, 88.0f, 88.0f, 256.0f, 88.0f)
                curveTo(424.0f, 88.0f, 496.0f, 192.0f, 496.0f, 192.0f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
