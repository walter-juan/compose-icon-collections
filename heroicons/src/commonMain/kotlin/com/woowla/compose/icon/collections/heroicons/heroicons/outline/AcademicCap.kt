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

public val OutlineGroup.AcademicCap: ImageVector
    get() {
        if (_academicCap != null) {
            return _academicCap!!
        }
        _academicCap = Builder(name = "AcademicCap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.259f, 10.147f)
                curveTo(3.987f, 12.231f, 3.821f, 14.348f, 3.769f, 16.494f)
                curveTo(6.665f, 17.703f, 9.419f, 19.184f, 12.0f, 20.904f)
                curveTo(14.581f, 19.184f, 17.336f, 17.703f, 20.232f, 16.494f)
                curveTo(20.179f, 14.348f, 20.013f, 12.231f, 19.741f, 10.147f)
                moveTo(4.259f, 10.147f)
                curveTo(3.384f, 9.852f, 2.497f, 9.581f, 1.601f, 9.334f)
                curveTo(4.846f, 7.059f, 8.327f, 5.097f, 12.0f, 3.493f)
                curveTo(15.673f, 5.097f, 19.154f, 7.059f, 22.399f, 9.334f)
                curveTo(21.503f, 9.581f, 20.616f, 9.852f, 19.741f, 10.147f)
                moveTo(4.259f, 10.147f)
                curveTo(6.947f, 11.05f, 9.534f, 12.171f, 12.0f, 13.489f)
                curveTo(14.466f, 12.171f, 17.053f, 11.05f, 19.741f, 10.147f)
                moveTo(6.75f, 15.0f)
                curveTo(7.164f, 15.0f, 7.5f, 14.664f, 7.5f, 14.25f)
                curveTo(7.5f, 13.836f, 7.164f, 13.5f, 6.75f, 13.5f)
                curveTo(6.336f, 13.5f, 6.0f, 13.836f, 6.0f, 14.25f)
                curveTo(6.0f, 14.664f, 6.336f, 15.0f, 6.75f, 15.0f)
                close()
                moveTo(6.75f, 15.0f)
                verticalLineTo(11.325f)
                curveTo(8.441f, 10.274f, 10.194f, 9.311f, 12.0f, 8.443f)
                moveTo(4.993f, 19.993f)
                curveTo(6.164f, 18.821f, 6.75f, 17.285f, 6.75f, 15.75f)
                verticalLineTo(14.25f)
            }
        }
        .build()
        return _academicCap!!
    }

private var _academicCap: ImageVector? = null
