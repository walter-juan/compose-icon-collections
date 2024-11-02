package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.75f, 1.5f)
                curveTo(12.022f, 1.5f, 9.0f, 4.522f, 9.0f, 8.25f)
                curveTo(9.0f, 8.644f, 9.034f, 9.03f, 9.099f, 9.406f)
                curveTo(9.166f, 9.795f, 9.067f, 10.123f, 8.878f, 10.312f)
                lineTo(2.379f, 16.811f)
                curveTo(1.816f, 17.373f, 1.5f, 18.136f, 1.5f, 18.932f)
                verticalLineTo(21.75f)
                curveTo(1.5f, 22.164f, 1.836f, 22.5f, 2.25f, 22.5f)
                horizontalLineTo(6.0f)
                curveTo(6.414f, 22.5f, 6.75f, 22.164f, 6.75f, 21.75f)
                verticalLineTo(20.25f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 20.25f, 9.0f, 19.914f, 9.0f, 19.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.5f)
                curveTo(10.699f, 18.0f, 10.89f, 17.921f, 11.03f, 17.78f)
                lineTo(13.688f, 15.122f)
                curveTo(13.877f, 14.933f, 14.205f, 14.834f, 14.594f, 14.901f)
                curveTo(14.97f, 14.966f, 15.356f, 15.0f, 15.75f, 15.0f)
                curveTo(19.478f, 15.0f, 22.5f, 11.978f, 22.5f, 8.25f)
                curveTo(22.5f, 4.522f, 19.478f, 1.5f, 15.75f, 1.5f)
                close()
                moveTo(15.75f, 4.5f)
                curveTo(15.336f, 4.5f, 15.0f, 4.836f, 15.0f, 5.25f)
                curveTo(15.0f, 5.664f, 15.336f, 6.0f, 15.75f, 6.0f)
                curveTo(16.993f, 6.0f, 18.0f, 7.007f, 18.0f, 8.25f)
                curveTo(18.0f, 8.664f, 18.336f, 9.0f, 18.75f, 9.0f)
                curveTo(19.164f, 9.0f, 19.5f, 8.664f, 19.5f, 8.25f)
                curveTo(19.5f, 6.179f, 17.821f, 4.5f, 15.75f, 4.5f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
