package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.PhoneArrowDownLeft: ImageVector
    get() {
        if (_phoneArrowDownLeft != null) {
            return _phoneArrowDownLeft!!
        }
        _phoneArrowDownLeft = Builder(name = "PhoneArrowDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 9.75f)
                curveTo(19.5f, 10.164f, 19.164f, 10.5f, 18.75f, 10.5f)
                lineTo(14.25f, 10.5f)
                curveTo(13.836f, 10.5f, 13.5f, 10.164f, 13.5f, 9.75f)
                verticalLineTo(5.25f)
                curveTo(13.5f, 4.836f, 13.836f, 4.5f, 14.25f, 4.5f)
                curveTo(14.664f, 4.5f, 15.0f, 4.836f, 15.0f, 5.25f)
                verticalLineTo(7.939f)
                lineTo(19.72f, 3.22f)
                curveTo(20.013f, 2.927f, 20.487f, 2.927f, 20.78f, 3.22f)
                curveTo(21.073f, 3.513f, 21.073f, 3.987f, 20.78f, 4.28f)
                lineTo(16.061f, 9.0f)
                lineTo(18.75f, 9.0f)
                curveTo(19.164f, 9.0f, 19.5f, 9.336f, 19.5f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 4.5f)
                curveTo(1.5f, 2.843f, 2.843f, 1.5f, 4.5f, 1.5f)
                horizontalLineTo(5.872f)
                curveTo(6.732f, 1.5f, 7.482f, 2.086f, 7.691f, 2.92f)
                lineTo(8.796f, 7.343f)
                curveTo(8.979f, 8.075f, 8.706f, 8.846f, 8.102f, 9.298f)
                lineTo(6.809f, 10.268f)
                curveTo(6.674f, 10.369f, 6.645f, 10.517f, 6.683f, 10.62f)
                curveTo(7.819f, 13.719f, 10.281f, 16.181f, 13.38f, 17.317f)
                curveTo(13.483f, 17.355f, 13.631f, 17.326f, 13.732f, 17.191f)
                lineTo(14.702f, 15.898f)
                curveTo(15.155f, 15.294f, 15.925f, 15.021f, 16.657f, 15.204f)
                lineTo(21.08f, 16.309f)
                curveTo(21.914f, 16.518f, 22.5f, 17.268f, 22.5f, 18.128f)
                verticalLineTo(19.5f)
                curveTo(22.5f, 21.157f, 21.157f, 22.5f, 19.5f, 22.5f)
                horizontalLineTo(17.25f)
                curveTo(8.552f, 22.5f, 1.5f, 15.448f, 1.5f, 6.75f)
                verticalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _phoneArrowDownLeft!!
    }

private var _phoneArrowDownLeft: ImageVector? = null
