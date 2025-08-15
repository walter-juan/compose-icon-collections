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

public val SolidGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 205.8f)
                curveToRelative(-14.8f, 9.8f, -31.8f, 17.7f, -49.5f, 24.0f)
                curveToRelative(-47.0f, 16.8f, -108.7f, 26.2f, -174.5f, 26.2f)
                reflectiveCurveTo(96.4f, 246.5f, 49.5f, 229.8f)
                curveToRelative(-17.6f, -6.3f, -34.7f, -14.2f, -49.5f, -24.0f)
                lineTo(0.0f, 288.0f)
                curveToRelative(0.0f, 44.2f, 100.3f, 80.0f, 224.0f, 80.0f)
                reflectiveCurveToRelative(224.0f, -35.8f, 224.0f, -80.0f)
                lineToRelative(0.0f, -82.2f)
                close()
                moveTo(448.0f, 128.0f)
                lineToRelative(0.0f, -48.0f)
                curveTo(448.0f, 35.8f, 347.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(0.0f, 35.8f, 0.0f, 80.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 44.2f, 100.3f, 80.0f, 224.0f, 80.0f)
                reflectiveCurveToRelative(224.0f, -35.8f, 224.0f, -80.0f)
                close()
                moveTo(398.5f, 389.8f)
                curveTo(351.6f, 406.5f, 289.9f, 416.0f, 224.0f, 416.0f)
                reflectiveCurveTo(96.4f, 406.5f, 49.5f, 389.8f)
                curveToRelative(-17.6f, -6.3f, -34.7f, -14.2f, -49.5f, -24.0f)
                lineTo(0.0f, 432.0f)
                curveToRelative(0.0f, 44.2f, 100.3f, 80.0f, 224.0f, 80.0f)
                reflectiveCurveToRelative(224.0f, -35.8f, 224.0f, -80.0f)
                lineToRelative(0.0f, -66.2f)
                curveToRelative(-14.8f, 9.8f, -31.8f, 17.7f, -49.5f, 24.0f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
