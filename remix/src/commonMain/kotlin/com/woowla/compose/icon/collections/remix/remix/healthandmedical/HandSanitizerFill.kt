package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.HandSanitizerFill: ImageVector
    get() {
        if (_handSanitizerFill != null) {
            return _handSanitizerFill!!
        }
        _handSanitizerFill = Builder(name = "HandSanitizerFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(13.0f, 3.999f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                curveTo(18.209f, 8.0f, 20.0f, 9.791f, 20.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.105f, 19.105f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.896f, 22.0f, 4.0f, 21.105f, 4.0f, 20.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 9.791f, 5.791f, 8.0f, 8.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.999f)
                lineTo(7.5f, 4.0f)
                curveTo(6.87f, 4.0f, 6.13f, 4.49f, 5.3f, 5.6f)
                lineTo(3.7f, 4.4f)
                curveTo(4.87f, 2.84f, 6.13f, 2.0f, 7.5f, 2.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.999f)
                lineTo(11.0f, 18.0f)
                horizontalLineTo(13.0f)
                lineTo(12.999f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _handSanitizerFill!!
    }

private var _handSanitizerFill: ImageVector? = null
