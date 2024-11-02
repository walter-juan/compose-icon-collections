package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.712f, 4.33f)
                curveTo(17.3f, 4.692f, 17.855f, 5.127f, 18.364f, 5.636f)
                curveTo(18.873f, 6.145f, 19.309f, 6.7f, 19.67f, 7.288f)
                moveTo(16.712f, 4.33f)
                lineTo(13.264f, 8.468f)
                moveTo(16.712f, 4.33f)
                curveTo(13.832f, 2.557f, 10.168f, 2.557f, 7.288f, 4.33f)
                moveTo(19.67f, 7.288f)
                lineTo(15.532f, 10.736f)
                moveTo(19.67f, 7.288f)
                curveTo(21.443f, 10.168f, 21.443f, 13.832f, 19.67f, 16.712f)
                moveTo(15.532f, 10.736f)
                curveTo(15.351f, 10.23f, 15.057f, 9.754f, 14.652f, 9.348f)
                curveTo(14.246f, 8.943f, 13.77f, 8.649f, 13.264f, 8.468f)
                moveTo(15.532f, 10.736f)
                curveTo(15.823f, 11.552f, 15.823f, 12.448f, 15.532f, 13.264f)
                moveTo(13.264f, 8.468f)
                curveTo(12.448f, 8.177f, 11.552f, 8.177f, 10.736f, 8.468f)
                moveTo(15.532f, 13.264f)
                curveTo(15.351f, 13.77f, 15.057f, 14.246f, 14.652f, 14.652f)
                curveTo(14.246f, 15.057f, 13.77f, 15.351f, 13.264f, 15.532f)
                moveTo(15.532f, 13.264f)
                lineTo(19.67f, 16.712f)
                moveTo(19.67f, 16.712f)
                curveTo(19.309f, 17.3f, 18.873f, 17.855f, 18.364f, 18.364f)
                curveTo(17.855f, 18.873f, 17.3f, 19.309f, 16.712f, 19.67f)
                moveTo(16.712f, 19.67f)
                lineTo(13.264f, 15.532f)
                moveTo(16.712f, 19.67f)
                curveTo(13.832f, 21.443f, 10.168f, 21.443f, 7.288f, 19.67f)
                moveTo(13.264f, 15.532f)
                curveTo(12.448f, 15.823f, 11.552f, 15.823f, 10.736f, 15.532f)
                moveTo(10.736f, 15.532f)
                curveTo(10.23f, 15.351f, 9.754f, 15.057f, 9.348f, 14.652f)
                curveTo(8.943f, 14.246f, 8.649f, 13.77f, 8.468f, 13.264f)
                moveTo(10.736f, 15.532f)
                lineTo(7.288f, 19.67f)
                moveTo(7.288f, 19.67f)
                curveTo(6.7f, 19.309f, 6.145f, 18.873f, 5.636f, 18.364f)
                curveTo(5.127f, 17.855f, 4.692f, 17.3f, 4.33f, 16.712f)
                moveTo(4.33f, 16.712f)
                lineTo(8.468f, 13.264f)
                moveTo(4.33f, 16.712f)
                curveTo(2.557f, 13.832f, 2.557f, 10.168f, 4.33f, 7.288f)
                moveTo(8.468f, 13.264f)
                curveTo(8.177f, 12.448f, 8.177f, 11.552f, 8.468f, 10.736f)
                moveTo(8.468f, 10.736f)
                curveTo(8.649f, 10.23f, 8.943f, 9.754f, 9.348f, 9.348f)
                curveTo(9.754f, 8.943f, 10.23f, 8.649f, 10.736f, 8.468f)
                moveTo(8.468f, 10.736f)
                lineTo(4.33f, 7.288f)
                moveTo(10.736f, 8.468f)
                lineTo(7.288f, 4.33f)
                moveTo(7.288f, 4.33f)
                curveTo(6.7f, 4.692f, 6.145f, 5.127f, 5.636f, 5.636f)
                curveTo(5.127f, 6.145f, 4.692f, 6.7f, 4.33f, 7.288f)
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
