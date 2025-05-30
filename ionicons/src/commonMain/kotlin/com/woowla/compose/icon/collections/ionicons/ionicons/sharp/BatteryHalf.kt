package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

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
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.BatteryHalf: ImageVector
    get() {
        if (_batteryHalf != null) {
            return _batteryHalf!!
        }
        _batteryHalf = Builder(name = "BatteryHalf", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 384.0f)
                horizontalLineTo(449.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(49.0f, 160.0f)
                horizontalLineTo(417.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(49.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.69f, 182.92f)
                horizontalLineToRelative(185.31f)
                verticalLineToRelative(146.16f)
                horizontalLineToRelative(-185.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(465.0f, 202.67f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(106.67f)
                horizontalLineToRelative(-32.0f)
                close()
            }
        }
        .build()
        return _batteryHalf!!
    }

private var _batteryHalf: ImageVector? = null
