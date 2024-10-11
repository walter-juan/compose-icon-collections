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

public val HealthAndMedicalGroup.TestTubeFill: ImageVector
    get() {
        if (_testTubeFill != null) {
            return _testTubeFill!!
        }
        _testTubeFill = Builder(name = "TestTubeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                curveTo(16.0f, 20.209f, 14.209f, 22.0f, 12.0f, 22.0f)
                curveTo(9.791f, 22.0f, 8.0f, 20.209f, 8.0f, 18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(13.0f, 15.0f)
                curveTo(12.448f, 15.0f, 12.0f, 15.448f, 12.0f, 16.0f)
                curveTo(12.0f, 16.552f, 12.448f, 17.0f, 13.0f, 17.0f)
                curveTo(13.552f, 17.0f, 14.0f, 16.552f, 14.0f, 16.0f)
                curveTo(14.0f, 15.448f, 13.552f, 15.0f, 13.0f, 15.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(10.448f, 12.0f, 10.0f, 12.448f, 10.0f, 13.0f)
                curveTo(10.0f, 13.552f, 10.448f, 14.0f, 11.0f, 14.0f)
                curveTo(11.552f, 14.0f, 12.0f, 13.552f, 12.0f, 13.0f)
                curveTo(12.0f, 12.448f, 11.552f, 12.0f, 11.0f, 12.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _testTubeFill!!
    }

private var _testTubeFill: ImageVector? = null
